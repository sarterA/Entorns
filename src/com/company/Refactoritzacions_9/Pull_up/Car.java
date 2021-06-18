package com.company.Refactoritzacions_9.Pull_up;

public class Car extends Vehicle {

        private String trunk;
        private boolean isTrunkOpened;

        public boolean isTrunkOpen() {
            return isTrunkOpened;
        }
}
