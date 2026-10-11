# Extension Validation Report

- Extension: tachiyomi-en.rinkocomics-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4915548839286527736
- Source name: Rinko Comics
- Source language: en
- Selected manga input: popular offset 0: Villain Family’s Strongest Butler (`.../villain-familys-strongest-butler`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 7 | Villain Family’s Strongest Butler (`.../villain-familys-strongest-butler`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | N Years of Unrequited Love (`.../n-years-of-unrequited-love`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Error D Echo (`.../error-d-echo`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Villain Family’s Strongest Butler (`.../villain-familys-strongest-butler`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Villain Family’s Strongest Butler (`.../villain-familys-strongest-butler`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 21 | Chapter 1 (`.../villain-familys-strongest-butler-chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 29 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 7 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Villain Family’s Strongest Butler, URL=`.../villain-familys-strongest-butler` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 48/48 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 48/48 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rinkocomics.com/.../9c472796-4ba5-4e1b-8110-45bf029aee80-210x300.webp` (image/webp (encoding: lossless), 93348 bytes, 210x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../villain-familys-strongest-butler` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://rinkocomics.com/.../9c472796-4ba5-4e1b-8110-45bf029aee80.webp` (image/webp (encoding: lossless), 407878 bytes, 447x640) |  |  |  |
| details author | PASS | Unknown Author |  |  |  |
| details artist | PASS | Manhwa |  |  |  |
| details genres | PASS | Fantasy, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A year after dying on the battlefield, I woke up in a new body. But where am I? “This is the territory of Grand Duke Vallot in the Kadea Empire, my lady.” Of all places, it had to be the land of my greatest enemy, Grand Duke Vallot!!! I was dragged before the grand duke. “Restrain her.” Without warning, they put restraints on me. “Drink this.” They even made me drink the sap of the World Tree, which forces you to tell the truth. “Oh please, Grand Duke, spare me. Who knows? I might become someone you really like.” For some reason, the sap made me confess my thoughts like a drunken fool. I ended up working as a maid in the grand duke’s mansion. ‘Well, since it’s come to this, I’ll endure it and return home with the grand duke’s head in two years!’ Two years later. I became the one and only butler capable of taking down assassins in the grand duke’s house. “The success of the banquet is all thanks to our butler!” “I was moved by the sight of her tending the garden in the pouring rain.” “She even took down an assassin, right?” “The smooth running of the grand duke’s house is all thanks to our butler!” I received more praise than I ever did as a knight. Uh…? ‘Could it be that… being a butler is my true calling?’ *** Q: Surely, you don’t mean to say that a female butler can serve as an advisor or a bodyguard, right? A: Our butler is quite versatile. There’s nothing my butler can’t do. She’s the strongest, after all. (smirks) Q: Is it true that the grand duke has fallen for his butler, who isn’t even a noble? A: Oh yes, it’s true. In fact, I’m the one who’s more attached. I wish she would come to me quickly. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 21 chapters |  |  |  |
| chapter dates | PASS | 21 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.rinkocomics.com/.../01__604712d4-dfe6-40b7-8c39-0e4e087a9499.webp` (image/webp (encoding: lossy), 890112 bytes, 800x8000) |  |  |  |
