package IndividualProject.VanillaArray;

public class CheckVanilla {
    int vanillaWith;
    public void setVanillaWith(int vanillaWith) {
        this.vanillaWith = vanillaWith;
    }
    public int isVanilla(int[] numArray) {
        if(numArray.length == 0) return 1;
        int isVanilla = 1;
        setVanillaWith(numArray[0] % 10);
        for (int elem: numArray) {
            if(!isVanillaElement(elem)) {
                isVanilla = 0;
                break;
            }
        }
        return isVanilla;
    }

    public boolean isVanillaElement(int element) {
        boolean isVanillaElement = true;
        while(element > 0) {
            int digit = element % 10;
            if(digit != this.vanillaWith) {
                isVanillaElement = false;
                break;
            }
            element /= 10;
        }
        return isVanillaElement;
    }
}