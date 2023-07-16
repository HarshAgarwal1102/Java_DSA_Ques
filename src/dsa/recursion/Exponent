Class Exponent{
int power(int a, int b) {
    //base case
    if( b == 0 )
        return 1;

    if(b == 1)
        return a;

    //RECURSIVE CALL
    int ans = power(a, b/2);

    //if b is even
    if(b%2 == 0) {
        return ans * ans;
    }
    else {
        //if b is odd
        return a * ans * ans;
    }
}

public static void main(String[] args) {

    int ans = power(3,10);

    cout << "Answer is " << ans << endl;

    return 0;
}
}
