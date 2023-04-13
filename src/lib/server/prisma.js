import { PrismaClient } from '@prisma/client';

const prisma = new PrismaClient();

async function getFirstBook(){
  var firstBook = await prisma.book.findFirst();
  return firstBook;
}
async function getBooks(term){
  var titles = new Array();
  var allBooks = await prisma.book.findMany({
    where: {
      Author: {
        contains: term
      }
    }
  })
  if (allBooks.length == 0){
    console.log("no books match term.")
  }
  else{
    for(let i = 0; i<allBooks.length; i++){
      titles.push(allBooks[i].title.toString());
    }
    };
    console.log(titles)
  }

var authorname = "croshaw"
getBooks(authorname)