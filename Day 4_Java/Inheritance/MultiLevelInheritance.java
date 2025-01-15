class NuclearForce extends FundamentalForce {
    void Nuclear() {
        System.out.println("Nuclear Forces are of two types;");
        System.out.println("Strong Nuclear Force");
        System.out.println("Weak Nuclear Force");
    }
}

class StrongNuclearForce extends NuclearForce {
    void Strong() {
        System.out.println("Strong Nuclear Force is responsible for the underlying stability of matter.");
    }
}

class MultilevelInheritance {
    public static void main(String[] args) {
        StrongNuclearForce st = new StrongNuclearForce();
        st.Force();
        st.Nuclear();
        st.Strong();
    }
}