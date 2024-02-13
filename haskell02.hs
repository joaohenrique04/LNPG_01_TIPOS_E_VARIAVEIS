main :: IO ()
main = do
    putStrLn "Vamos descobrir se um número é par ou ímpar!"
    putStrLn "Digite um número:"
    vlr <- getLine
    let numero = read vlr :: Int
    if even numero
        then putStrLn "O valor é par!"
        else putStrLn "O valor é ímpar!"
