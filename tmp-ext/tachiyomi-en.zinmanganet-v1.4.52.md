# Extension Validation Report

- Extension: tachiyomi-en.zinmanganet-v1.4.52
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 21
- Lint: 0
- Warnings: 1
- Skipped: 13
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 1987105317893699901
- Source name: Zinmanga.net
- Source language: en
- Selected manga input: latest offset 0: The Stellar Swordmaster (`.../the-stellar-swordmaster`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | Tales of Demons and Gods (`.../tales-of-demons-and-gods`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | The Stellar Swordmaster (`.../the-stellar-swordmaster`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Stellar Swordmaster (`.../the-stellar-swordmaster`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Stellar Swordmaster (`.../the-stellar-swordmaster`) |  | 1-10s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Stellar Swordmaster, URL=`.../the-stellar-swordmaster` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 25/25 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 25/25 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://img-r2.2xstorage.com/.../the-stellar-swordmaster.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../the-stellar-swordmaster` |  |  |  |
| details thumbnail URL | PASS | `https://img-r2.2xstorage.com/.../the-stellar-swordmaster.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Fantasy, Magic, Seinen, Shounen, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Welcome to ZinManga, your premier destination for reading manga online for free! Immerse yourself in the enchanting world of The Stellar Swordmaster Manga Online Free, where thrilling adventures and heartfelt moments await.<br><br>The so-called “Lighthouse of the North,” the prosperous trading town of Schoarra, hides a dark underbelly: seedy slums ruled by five ruthless crime bosses. When streetwise orphan Vlad finds the brothel he works for decimated by a disgraced knight, he turns to the path of the blade, pledging himself to the pursuit of power by sword. Blessed with the ability to seek wisdom from his sentient sword, Vlad embarks upon a journey of growth and peril as swordsman in service to the powerful House Vayezid.<br><br>ZinManga offers a fantastic selection of manga, including The Stellar Swordmaster, completely free of charge. You can enjoy all the latest chapters without any subscription fees, making it an ideal choice for those looking for free manga. With ZinManga, you can read manga without worrying about costs.<br><br>One of the standout features of ZinManga is its commitment to keeping content fresh. The Stellar Swordmaster is updated daily, ensuring that you never miss a chapter. You can follow the story as it unfolds in real time, adding excitement to your experience when you read manga online.<br><br>ZinManga provides a user-friendly platform that makes it easy to navigate. Whether you’re a seasoned manga reader or new to the genre, you’ll find it simple to search for The Stellar Swordmaster and discover other titles. The clean layout enhances your reading experience, minimizing distractions while you enjoy free manga on one of the best manga websites.<br><br>ZinManga ensures that all manga, including The Stellar Swordmaster, is presented in high quality. The images are clear, and the text is easy to read, allowing you to fully immerse yourself in the story without any visual distractions. This commitment to quality makes ZinManga one of the best manga free websites for those who want to read manga free.<br><br>You can read The Stellar Swordmaster on ZinManga from various devices—whether it’s your computer, tablet, or smartphone. This flexibility means you can enjoy your favorite manga anytime, anywhere. Whether you’re at home or on the go, you can read manga online without any hassle. ZinManga is one of the top free manga reading sites, providing an excellent opportunity to indulge in free manga online.<br><br>Don't limit yourself to just one genre! At ZinManga, we offer a vast array of free manga to explore. As you journey through our collection, you’ll discover captivating stories that span multiple themes. Dive in and read manga online today to experience all the excitement!<br><br>If you’re a fan of manhwa, you’ll be delighted by our selection. For those who enjoy manhua, we have plenty of titles to choose from as well. You can also dive into exciting harem manga or sweet romance manga.<br><br>Looking for something a bit different? Check out our Yaoi manga for heartfelt tales or seinen manga for more mature themes.<br><br>Whether searching for the latest manga-free titles or reading manga free from the comfort of your home, ZinManga is your go-to source. Our platform provides an excellent opportunity to read manga online and indulge in captivating stories.<br><br>Start your adventure in the world of free manga online today and find out why we are one of the top free manga reading sites! Join our community of manga enthusiasts and experience the joy of reading manga like never before!<br><br>Alternative Names: Byeoreul Pumeun Swordmaster; The Stellar Swordmaster; Star-Embracing Swordmaster; ยอดนักดาบผู้โอบอุ้มดารา |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://zinmanga.net/.../manga <redacted query values: m_orderby>` to `https://www.zinmanga.net/.../manga <redacted query values: m_orderby>` (3 redirects); latest: `https://zinmanga.net/.../manga <redacted query values: m_orderby>` to `https://www.zinmanga.net/.../manga <redacted query values: m_orderby>` (3 redirects); search: `https://zinmanga.net <redacted query values: s, post_type, and adult>` to `https://www.zinmanga.net <redacted query values: s, post_type, and adult>` (1 redirects); details: `https://zinmanga.net/.../the-stellar-swordmaster` to `https://www.zinmanga.net/.../the-stellar-swordmaster` (1 redirects); chapters: `https://zinmanga.net/.../the-stellar-swordmaster` to `https://www.zinmanga.net/.../the-stellar-swordmaster` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
