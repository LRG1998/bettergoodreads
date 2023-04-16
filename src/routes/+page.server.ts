import { getRandomBook } from "$lib/server/prisma";


export const load = (() => {
    const book = getRandomBook();
    console.log(book)
})