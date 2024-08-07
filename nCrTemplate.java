import java.io.*;
import java.util.*;

/* credits go to https://github.com/eyangch/competitive-programming/blob/master/templates/nCr.cpp, I just transformed it into java
   this template is for computing binomial coefficients modulus a large prime
*/
 
public class nCrTemplate {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer in;
  static int MAXN = (int)2e5+1;
	static long[] fact = new long[MAXN];
	static int MOD = (int)1e9+7;
 
	public static void main(String[] args) throws IOException {
	
		fact[0]=1L;
		 for (int i = 1; i < MAXN; i++) {
            fact[i] = fact[i - 1] * i;
            fact[i] %= MOD;
      }

    System.out.println(nCr(20, 3)); // example use
    System.out.println(nCr(20, 30)); // this will print 0;
    
	
 
 
 
 
 
	}

	 static long fexp(long a, long b) {
        long ans = 1;
        for (int i = 0; i < 35; i++) {
            if ((b & (1L << i)) != 0) {
                ans *= a;
                ans %= MOD;
            }
            a *= a;
            a %= MOD;
        }
        return ans;
    }

    static long nCr(int N, int K) {
		    if (K > N) return 0;
        return fact[N] * fexp(fact[K] * fact[N - K] % MOD, MOD - 2) % MOD;
    }
 
 
 
	
 
	static String next() throws IOException {
		while (in==null||!in.hasMoreTokens()) {
			in = new StringTokenizer(br.readLine());
		}
		return in.nextToken();
	}
	static int shit() throws IOException {
		return Integer.parseInt(next());
	}
	static long ll() throws IOException {
		return Long.parseLong(next());
	}
}
 
 
class Pair implements Comparable<Pair> {
  int a;
  int b;
 
  Pair(int a, int b) {
	this.a=a;
	this.b=b;
  }
 
  @Override
  public int compareTo(Pair other) {
	  if (a> other.a) return 1;
	  if (a < other.a) return -1;
	  return 0;
  }
 
  public String toString() {
	  return a + " " + b;
  }
 
 
  
 
}
