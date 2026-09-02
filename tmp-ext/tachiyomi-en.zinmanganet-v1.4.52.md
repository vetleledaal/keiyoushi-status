# Extension Validation Report

- Extension: tachiyomi-en.zinmanganet-v1.4.52
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 21
- Lint: 0
- Warnings: 0
- Skipped: 13
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1987105317893699901
- Source name: Zinmanga.net
- Source language: en
- Selected manga input: latest offset 0: Mood Disorder (`.../mood-disorder`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | Tales of Demons and Gods (`.../tales-of-demons-and-gods`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Mood Disorder (`.../mood-disorder`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Mood Disorder (`.../mood-disorder`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Mood Disorder (`.../mood-disorder`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 0 |  |  | 1-10s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mood Disorder, URL=`.../mood-disorder` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 25/25 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 25/25 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://cdn.zinmanga1.com/.../mood-disorder.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../mood-disorder` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.zinmanga1.com/.../mood-disorder.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Drama, Horror, Manhua, Shounen, Supernatural, full_color |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Welcome to ZinManga, your premier destination for reading manga online for free! Immerse yourself in the enchanting world of Mood Disorder Manga Online Free, where thrilling adventures and heartfelt moments await.<br><br>Read Mood Disorder / Emotional Illness From the Same Studio as the Manhua “Girl and Science”\] Everybody is crazy except me. But is it a misfortune to be sane in a crazy world?<br><br>ZinManga offers a fantastic selection of manga, including Mood Disorder, completely free of charge. You can enjoy all the latest chapters without any subscription fees, making it an ideal choice for those looking for free manga. With ZinManga, you can read manga without worrying about costs.<br><br>One of the standout features of ZinManga is its commitment to keeping content fresh. Mood Disorder is updated daily, ensuring that you never miss a chapter. You can follow the story as it unfolds in real time, adding excitement to your experience when you read manga online.<br><br>ZinManga provides a user-friendly platform that makes it easy to navigate. Whether you’re a seasoned manga reader or new to the genre, you’ll find it simple to search for Mood Disorder and discover other titles. The clean layout enhances your reading experience, minimizing distractions while you enjoy free manga on one of the best manga websites.<br><br>ZinManga ensures that all manga, including Mood Disorder, is presented in high quality. The images are clear, and the text is easy to read, allowing you to fully immerse yourself in the story without any visual distractions. This commitment to quality makes ZinManga one of the best manga free websites for those who want to read manga free.<br><br>You can read Mood Disorder on ZinManga from various devices—whether it’s your computer, tablet, or smartphone. This flexibility means you can enjoy your favorite manga anytime, anywhere. Whether you’re at home or on the go, you can read manga online without any hassle. ZinManga is one of the top free manga reading sites, providing an excellent opportunity to indulge in free manga online.<br><br>Don't limit yourself to just one genre! At ZinManga, we offer a vast array of free manga to explore. As you journey through our collection, you’ll discover captivating stories that span multiple themes. Dive in and read manga online today to experience all the excitement!<br><br>If you’re a fan of manhwa, you’ll be delighted by our selection. For those who enjoy manhua, we have plenty of titles to choose from as well. You can also dive into exciting harem manga or sweet romance manga.<br><br>Looking for something a bit different? Check out our Yaoi manga for heartfelt tales or seinen manga for more mature themes.<br><br>Whether searching for the latest manga-free titles or reading manga free from the comfort of your home, ZinManga is your go-to source. Our platform provides an excellent opportunity to read manga online and indulge in captivating stories.<br><br>Start your adventure in the world of free manga online today and find out why we are one of the top free manga reading sites! Join our community of manga enthusiasts and experience the joy of reading manga like never before!<br><br>Alternative Names: Emo \| 情绪病 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
