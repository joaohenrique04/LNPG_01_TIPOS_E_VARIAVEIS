main :: IO ()
main = do
    putStrLn "Vamos converter Celsius para Fahrenheit!"
    putStrLn "Digite a temperatura em Celsius:"
    vlr <- getLine
    let celsius = read vlr :: Float
    let fahrenheit = (celsius * 9/5) + 32
    putStrLn ("A temperatura em Fahrenheit é: " ++ show fahrenheit)
