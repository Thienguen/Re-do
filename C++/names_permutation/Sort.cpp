#include <fstream>
#include <iostream>
#include <cstdlib>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

int main()
{
    int counter = 1;
    int iter = -1;
    string str[6] = {};
    string fileName = "name.txt";
    ifstream inFile;
    inFile.open(fileName);

    //  clear data in the file
    std::ofstream ofs;
    ofs.open("output.txt", std::ofstream::out | std::ofstream::trunc);
    ofs.close();

    // ouput to a different file
    ofstream outFile;
    outFile.open("output.txt");

    if (inFile.is_open())
    {   
        while (!inFile.eof())
        {
            string s;
                getline(inFile, s);
                str[++iter] = s;
        }
        
        int n = sizeof(str) / sizeof(str[0]);

        std::sort(str, str + n);

        do 
        {
            outFile << "\n\nPermutations: " << counter++ << endl;
            for (size_t i = 0; i < n; i++)
            {
                // output the permutations to a different file
                outFile << str[i] << " ";
            }

        } while (next_permutation(str, str + n));
        
        inFile.close();
    }
    else
    {
        cout << "File not found" << endl;
    }

    return 0;
}

