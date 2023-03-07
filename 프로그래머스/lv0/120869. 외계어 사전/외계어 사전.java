class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        for (int i = 0; i < dic.length; i++) {
            if(dic[i].length() != spell.length)
                continue;
            int cnt = 0;
            for (int j = 0; j < spell.length; j++) {
                if(dic[i].contains(spell[j]))
                    cnt++;
            }
            if (cnt == spell.length)
                return 1;
        }

        return answer;
    }
}