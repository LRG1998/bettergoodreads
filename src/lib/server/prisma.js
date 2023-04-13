import { PrismaClient } from '@prisma/client';

const prisma = new PrismaClient();

async function getFirstBook(){
  var firstBook = await prisma.book.findFirst();
  return firstBook;
}
async function getBooks(term){
  var allBooks = await prisma.book.findMany({
    where: {
      Publisher: {
        contains: term
      }
    }
  })
  if (allBooks.length == 0){
    console.log("no books match term.")
  }
  else{
    console.log(allBooks.length)
  }

}
var authorname = "yahtzee"
getBooks(authorname)