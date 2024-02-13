main :: IO ()
main = do
    putStrLn "Vamos brincar de Calculadora"
    putStrLn "Digite o primeiro número:"
    var1 <- getLine
    putStrLn "Digite o segundo número:"
    var2 <- getLine
    let num1 = read var1 :: Float
    let num2 = read var2 :: Float
    putStrLn ("Soma: " ++ show (num1+num2))
    putStrLn ("Subtração: " ++ show (num1-num2))
    putStrLn ("Multiplicação: " ++ show (num1*num2))
    putStrLn ("Divisão: " ++ show (num1 / num2))