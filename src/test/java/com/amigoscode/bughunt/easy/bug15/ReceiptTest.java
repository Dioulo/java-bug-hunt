package com.amigoscode.bughunt.easy.bug15;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReceiptTest {

    @Test
    void formatsLineCorrectly() {
        Receipt r = new Receipt();
        String line = r.addLine("coffee", 2, 3.50);

        // Le nom de l'article est aligné à gauche sur 12 caractères, puis viennent la quantité et le prix unitaire.
        // Les montants utilisent deux décimales séparées par une virgule, et le total correspond à quantité × prix.
        assertThat(line).isEqualTo("coffee       x2 @ $3,50 = $7,00");
    }

    @Test
    void formatsFooter() {
        Receipt r = new Receipt();
        r.addLine("tea", 1, 2.00);
        r.addLine("cake", 2, 4.25);

        assertThat(r.footer()).isEqualTo("TOTAL: $10,50");
    }
}
