# Extension Validation Report

- Extension: tachiyomi-en.zinmanganet-v1.6.62
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 1987105317893699901
- Source name: Zinmanga.net
- Source language: en
- Selected manga input: popular offset 0: Tales of Demons and Gods (`.../tales-of-demons-and-gods`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Tales of Demons and Gods (`.../tales-of-demons-and-gods`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Who Let Him Cultivate Immortality (`.../who-let-him-cultivate-immortality`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Tales of Demons and Gods (Colored) (`.../tales-of-demons-and-gods-colored`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tales of Demons and Gods (`.../tales-of-demons-and-gods`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2001 | Chapter 0 (`.../chapter-0`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 161 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Tales of Demons and Gods, URL=`.../tales-of-demons-and-gods` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 27/27 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 27/27 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.zinmanga1.com/.../tales-of-demons-and-gods.webp` (image/webp (encoding: lossy), 18232 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tales-of-demons-and-gods` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.zinmanga1.com/.../tales-of-demons-and-gods.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Cooking, Drama, Fantasy, Harem, Manhua, Martial Arts, Reincarnation, Romance, Shounen, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Welcome to ZinManga, your premier destination for reading manga online for free! Immerse yourself in the enchanting world of Tales of Demons and Gods Manga Online Free, where thrilling adventures and heartfelt moments await.<br><br>Tales of Demons and Gods In his past life, although too weak to protect his home when it counted, out of grave determination Nie Li became the strongest Demon Spiritist and stood at the pinnacle of the martial world. However, he lost his life during the battle with the Sage Emperor and six deity-ranked beasts. His soul was then brought back to when he was still 13 years old. Although he’s the weakest in his class with the lowest talent, having only a red soul realm and a weak one at that, with the aid of the vast knowledge which he accumulated from his previous life, he decided to train faster than anyone could expect. He also decided to help those who died nobly in his previous life to train faster as well. He aims to protect the city from the coming future of being devastated by demon beasts and the previous fate of ending up destroyed. He aims to protect his lover, friends, family and fellow citizens who died in the beast assault or its aftermath. And he aims to destroy the so-called Sacred family who arrogantly abandoned their duty and betrayed the city in his past life. Cuentos de Demonios y Dioses Fortellinger om Demoner og Guder Tales of Demons and Gods Клеймо Зловещего Духа Сказания о Демонах и Богах 요신기 妖神记 妖神记（全彩） Search for series of same genre(s) Welcome to Mangazin site, you can read and enjoy all kinds of Manhua trending such as Drama, Manga, Manhwa, Romance…, for free here. All of the manhua new will be update with high standards every hours. If you are a Comics book (Manhua Hot ), MangaZin is your best choice, don’t hesitate, just read and feel !<br><br>ZinManga offers a fantastic selection of manga, including Tales of Demons and Gods, completely free of charge. You can enjoy all the latest chapters without any subscription fees, making it an ideal choice for those looking for free manga. With ZinManga, you can read manga without worrying about costs.<br><br>One of the standout features of ZinManga is its commitment to keeping content fresh. Tales of Demons and Gods is updated daily, ensuring that you never miss a chapter. You can follow the story as it unfolds in real time, adding excitement to your experience when you read manga online.<br><br>ZinManga provides a user-friendly platform that makes it easy to navigate. Whether you’re a seasoned manga reader or new to the genre, you’ll find it simple to search for Tales of Demons and Gods and discover other titles. The clean layout enhances your reading experience, minimizing distractions while you enjoy free manga on one of the best manga websites.<br><br>ZinManga ensures that all manga, including Tales of Demons and Gods, is presented in high quality. The images are clear, and the text is easy to read, allowing you to fully immerse yourself in the story without any visual distractions. This commitment to quality makes ZinManga one of the best manga free websites for those who want to read manga free.<br><br>You can read Tales of Demons and Gods on ZinManga from various devices—whether it’s your computer, tablet, or smartphone. This flexibility means you can enjoy your favorite manga anytime, anywhere. Whether you’re at home or on the go, you can read manga online without any hassle. ZinManga is one of the top free manga reading sites, providing an excellent opportunity to indulge in free manga online.<br><br>Don't limit yourself to just one genre! At ZinManga, we offer a vast array of free manga to explore. As you journey through our collection, you’ll discover captivating stories that span multiple themes. Dive in and read manga online today to experience all the excitement!<br><br>If you’re a fan of manhwa, you’ll be delighted by our selection. For those who enjoy manhua, we have plenty of titles to choose from as well. You can also dive into exciting harem manga or sweet romance manga.<br><br>Looking for something a bit different? Check out our Yaoi manga for heartfelt tales or seinen manga for more mature themes.<br><br>Whether searching for the latest manga-free titles or reading manga free from the comfort of your home, ZinManga is your go-to source. Our platform provides an excellent opportunity to read manga online and indulge in captivating stories.<br><br>Start your adventure in the world of free manga online today and find out why we are one of the top free manga reading sites! Join our community of manga enthusiasts and experience the joy of reading manga like never before!<br><br>Alternative Names: Cuentos de Demonios y Dioses Fortellinger om Demoner og Guder Tales of Demons and Gods TDG TODG Yaoshenji Yāo Shén Jì Yêu Thần Ký Клеймо Зловещего Духа Сказания о Демонах и Богах 요신기 妖神记 妖神记（全彩） |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2001 chapters |  |  |  |
| chapter dates | PASS | 2001 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 161 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.zinmanga.net/.../manga <redacted query values: m_orderby>` to `https://www.zinmanga.net/.../manga <redacted query values: m_orderby>` (2 redirects); popular: `https://www.zinmanga.net/.../manga <redacted query values: m_orderby>` to `https://www.zinmanga.net/.../manga <redacted query values: m_orderby>` (2 redirects); popular: `https://www.zinmanga.net/.../chapter-0` to `https://www.zinmanga.net/.../chapter-0` (2 redirects) |  |  |  |
| page load | PASS | `https://cdn.zinmanga1.com/.../0.webp` (image/webp (encoding: lossy), 71376 bytes, 1000x562) |  |  |  |
