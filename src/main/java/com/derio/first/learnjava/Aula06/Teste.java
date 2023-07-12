package com.derio.first.learnjava.Aula06;

public class Teste extends AceleraCarro {

    public class Test {

        public void fazerCarroAcelerar(AceleraCarro aceleracarro) {
            aceleracarro.acelerar();
        }
    }

    public static void main(String[] args) {
        Teste t = new Teste();
        t.fazerCarroAcelerar(new AceleraCarro());
        t.fazerCarroAcelerar(new AceleraCarroMclaren());
        t.fazerCarroAcelerar(new AceleraCarroFusion());
    }

    public AceleraCarro fazerCarroAcelerar(AceleraCarro aceleraCarro) {
        return aceleraCarro;

    }
}
