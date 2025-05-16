public enum Armas {
    ESPADA(10) {
        @Override
        public String efeitoEspecial() {
            return "Cortar";
        }

    },
    ESCUDO(5) {
        @Override
        public String efeitoEspecial() {
            return "Defender";
        }
    },
    ARCO(15) {
        @Override
        public String efeitoEspecial() {
            return "Atirar";
        }
    },
    CAJADO(20) {
        @Override
        public String efeitoEspecial() {
            return "Bola de fogo";
        }
    },
    ADAGA(15) {
        @Override
        public String efeitoEspecial() {
            return "Veneno";
        }
    },
    MACHADO(20) {
        @Override
        public String efeitoEspecial() {
            return "Berserker";
        }
    },
    PICARETA(8) {

        @Override
        public String efeitoEspecial() {
            return "Escavar";
        }
    },

    VARINHA(3) {
        @Override
        public String efeitoEspecial() {
            return "Magia de Ilusao";
        }
    };

    private int dano;

    Armas(int dano) {
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }

    public abstract String efeitoEspecial();
}
