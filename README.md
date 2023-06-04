<h1>Java Grade Calculation</h1>

  <h2>Getting Started</h2>

  <p>To run the program, follow these steps:</p>

  <ol>
    <li>Ensure you have Java Development Kit (JDK) installed on your system.</li>
    <li>Clone the repository or download the source code file.</li>
    <li>Open a terminal or command prompt and navigate to the directory containing the source code file.</li>
    <li>Compile the code by executing the following command:<br>
      <code>javac Main.java</code></li>
    <li>Run the program using the command:<br>
      <code>java Main</code></li>
  </ol>

  <h2>Usage</h2>

  <ol>
    <li>The program prompts the user to enter the grades for five subjects: Mathematics, Physics, Turkish, Chemistry, and
      Music.</li>
    <li>Enter the grades for each subject when prompted.</li>
    <li>The program validates that all grades are within the range of 0 to 100 (inclusive).</li>
    <li>If any grade is outside the valid range, an error message is displayed.</li>
    <li>If all grades are valid, the program calculates the average grade.</li>
    <li>If the average grade is greater than or equal to 55, a success message is displayed, indicating that the student
      passed. The average grade is also shown.</li>
    <li>If the average grade is less than 55, a failure message is displayed, indicating that the student failed. The
      average grade is also shown.</li>
  </ol>

  <h2>Example</h2>

  <pre>
    Sırasıyla; Matematik, Fizik, Türkçe, Kimya, Müzik ders notlarınızı giriniz.
    75
    80
    65
    90
    70
    Tebrikler! Sınıfı geçtiniz. Ortalamanız: 76.0
  </pre>

  <p>In this example, the student entered the grades as follows:</p>

  <ul>
    <li>Mathematics: 75</li>
    <li>Physics: 80</li>
    <li>Turkish: 65</li>
    <li>Chemistry: 90</li>
    <li>Music: 70</li>
  </ul>

  <p>The average grade is calculated as (75 + 80 + 65 + 90 + 70) / 5 = 76.0. Since the average grade is greater than or equal
    to 55, the program displays a success message indicating that the student passed.</p>

  <h2>Note</h2>

  <ul>
    <li>Grades should be entered as integers between 0 and 100 (inclusive).</li>
    <li>The program only accepts numeric inputs for grades. Non-numeric inputs will cause the program to terminate with an
      error.</li>
    <li>Make sure to have proper error handling in place if you plan to use this code in a production environment.</li>
  </ul>
