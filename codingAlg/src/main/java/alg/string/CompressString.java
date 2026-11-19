package alg.string;

public class CompressString {
    public String compress(String input){
        if(input == null || input.isEmpty()){
            return  input;
        }
        char[] array = input.toCharArray();
        return encode(array);
    }

    public String encode(char[] array){
        //deal with adjacent character >= 2
        int slow = 0;
        int fast = 0;
        int newLength = 0;
        while (fast < array.length) {
            int beginningChar = fast;
            while (fast < array.length && array[fast] == array[beginningChar]) {
                fast++;
            }
            array[slow] = array[beginningChar];
            slow++;
            if(fast - beginningChar == 1){
                newLength = newLength + 2;
            } else{
                int len = copyDigits(array, slow, fast - beginningChar);
                slow = slow + len;
                newLength = len + 1;
            }
        }
            //deal with letter == 1
            char[] result = new char[newLength];
            fast = slow - 1;
            slow = newLength - 1;
            while(fast >= 0){
                if(Character.isDigit(array[fast])){
                    while (fast >= 0 && Character.isDigit(array[fast])) {
                        result[slow] = array[fast];
                        slow--;
                        fast--;
                    }
                }else{
                    result[slow] = '1';
                    slow--;
                }
                result[slow] = array[fast];
                slow--;
                fast--;
            }
            return new String(result);
        }

    //copy count as number following the char into array, starting at index
    public int copyDigits(char[] array, int index, int count){
        int len = 0;
        for(int i = count; i > 0; i = i/10){
            index++;
            len++;
        }
        for(int i = count; i > 0; i = i/10){
            int digit = i % 10;
            index--;
            array[index] = (char)('0' + digit);
        }
        return len;
    }
}
