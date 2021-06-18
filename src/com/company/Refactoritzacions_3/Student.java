package com.company.Refactoritzacions_3;

public class Student {
    public float evaluateTerm(float homeworkMark, float examMark, float attitude) {

        float resultat1 = examMark;
            if (examMark < 5) {
            resultat1 = 1;
            }
        float resultat2 = homeworkMark;
            if(homeworkMark < 4){
            resultat2 = 1;
            }
        return (resultat2 + resultat1) / 2 + attitude;
    }

}
