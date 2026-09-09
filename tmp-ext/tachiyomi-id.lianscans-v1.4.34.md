# Extension Validation Report

- Extension: tachiyomi-id.lianscans-v1.4.34
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 8863831356505058723
- Source name: LianScans
- Source language: id
- Selected manga input: latest offset 0: Honto wa Motto, Shitai dake (`.../honto-wa-motto-shitai-dake`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 40 | Tada de wa Dakaremasen (`.../tada-de-wa-dakaremasen`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 40 | Anmari sono Kinisasenaide (`.../anmari-sono-kinisasenaide`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 40 | Honto wa Motto, Shitai dake (`.../honto-wa-motto-shitai-dake`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 40 | Hatsujou Kiken Chitai (Hololive) (`.../hatsujou-kiken-chitai-hololive`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Honto wa Motto, Shitai dake (`.../honto-wa-motto-shitai-dake`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Honto wa Motto, Shitai dake (`.../honto-wa-motto-shitai-dake`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 00 END (`.../honto-wa-motto-shitai-dake-chapter-00-bahasa-indonesia`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 53 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Honto wa Motto, Shitai dake, URL=`.../honto-wa-motto-shitai-dake` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | `https://images2.imgbox.com/.../vcAEG8iF_o.jpg` (image/jpeg, 8091 bytes, 240x240); known placeholder: imgbox: Thumbnail Temporarily Unavailable | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../honto-wa-motto-shitai-dake` |  |  |  |
| details thumbnail URL | PASS | `https://images2.imgbox.com/.../vcAEG8iF_o.jpg` |  |  |  |
| details author | PASS | Takeshima Eku, Mizukusa Pan |  |  |  |
| details artist | PASS | Takeshima Eku, Mizukusa Pan |  |  |  |
| details genres | PASS | Ecchi, Romance, Slice of life, Smut, Yuri, Manga |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Koyomi dan Yako sudah berpacaran selama 3 bulan terakhir dan mulai tinggal bersama. Di hari perayaan sejak mereka tinggal bersama, untuk pertama kalinya, mereka memutuskan untuk berhubungan seks. Tapi di malam pertama mereka, terjadi sebuah “insiden”, membuat mereka berdua saling salahpaham dan tidak bisa jujur satu sama lain.<br><br>Alternative Names: Aku Masih Mau Lebih, ほんとはもっと、したいだけ, I really just want to do more. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://wsrv.nl <redacted query values: url>` (image/jpeg, 7178 bytes, 240x240) |  |  |  |
