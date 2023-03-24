class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] position = new int[2];
        int[][] parkNum = new int[park.length][park[0].length()];
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    position[0] = i;
                    position[1] = j;
                } else if (park[i].charAt(j) == 'X') {
                    parkNum[i][j] = -1;
                }
            }
        }

        int l = 0;
        while (l < routes.length) {
            boolean chk = true;
            int[] p = position;
            String[] command = routes[l].split(" ");
            String direction = command[0];
            int move = Integer.parseInt(command[1]);
            
            if (direction.equals("E")){
                for (int i = 1; i <= move; i++) {
                    if (position[1] + move >= parkNum[0].length){
                        chk = false;
                        break;
                    }else if (parkNum[position[0]][position[1] + i] == -1){
                        chk = false;
                        break;
                    }
                }
                if (chk)
                    position[1] += move;
            } else if (direction.equals("W")){
                for (int i = 1; i <= move; i++) {
                    if (position[1] - move < 0){
                        chk = false;
                        break;
                    }else if (parkNum[position[0]][position[1] - i] == -1){
                        chk = false;
                        break;
                    }
                }
                if (chk)
                    position[1] -= move;
            }else if (direction.equals("N")){
                for (int i = 1; i <= move; i++) {
                    if (position[0] - move < 0){
                        chk = false;
                        break;
                    }else if (parkNum[position[0] - i][position[1]] == -1){
                        chk = false;
                        break;
                    }
                }
                if (chk)
                    position[0] -= move;
            }else if (direction.equals("S")){
                for (int i = 1; i <= move; i++) {
                    if (position[0] + move >= parkNum.length){
                        chk = false;
                        break;
                    }else if (parkNum[position[0] + i][position[1]] == -1){
                        chk = false;
                        break;
                    }
                }
                if (chk)
                    position[0] += move;
            }

            l++;
        }

        return position;
    }
}