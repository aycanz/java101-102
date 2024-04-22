package interfaces;

class X implements IntA {
    @Override
    public void collect(int keyId) {
        System.out.println("X class - collect method: " + keyId);
    }

    @Override
    public void run(int keyId) {
        System.out.println("X class - run method: " + keyId);
    }

    @Override
    public void analysis(int keyId) {
        System.out.println("X class - analysis method: " + keyId);
    }

    // Sınıfa özgü metot
    public void xl() {
        System.out.println("X class - xl method");
    }
}

class Y implements IntA {
    @Override
    public void collect(int keyId) {
        System.out.println("Y class - collect method: " + keyId);
    }

    @Override
    public void run(int keyId) {
        System.out.println("Y class - run method: " + keyId);
    }

    @Override
    public void analysis(int keyId) {
        System.out.println("Y class - analysis method: " + keyId);
    }

    // Sınıfa özgü metot
    public void yl() {
        System.out.println("Y class - yl method");
    }
}

class Z implements IntA {
    @Override
    public void collect(int keyId) {
        System.out.println("Z class - collect method: " + keyId);
    }

    @Override
    public void run(int keyId) {
        System.out.println("Z class - run method: " + keyId);
    }

    @Override
    public void analysis(int keyId) {
        System.out.println("Z class - analysis method: " + keyId);
    }

    // Sınıfa özgü metot
    public void zl() {
        System.out.println("Z class - zl method");
    }
}