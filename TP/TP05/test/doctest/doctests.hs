-- file doctests.hs
import           Test.DocTest
main = doctest ["-isrc", "src/Lib.hs"]
