# Extension Validation Report

- Extension: tachiyomi-tr.shadowceviri-v1.6.15
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 28
- Lint: 2
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3852979672050614736
- Source name: Shadow Çeviri
- Source language: tr
- Selected manga input: popular offset 0: Hajime No Ippo (`.../hajime-no-ippo_1.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 14 | Hajime No Ippo (`.../hajime-no-ippo_1.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 11 | Hajime No Ippo (`.../hajime-no-ippo_1.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Hajime No Ippo (`.../hajime-no-ippo_1.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Hajime No Ippo (`.../hajime-no-ippo_1.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 232 | Raunt 943 (`.../hajime-no-ippo-943.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| popular listing | PASS | 14 entries |  |  |  |
| latest listing | PASS | 11 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Hajime No Ippo, URL=`.../hajime-no-ippo_1.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 9 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 26/26 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 26/26 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../Ippo%20Kapak.jpg` (image/jpeg, 1296329 bytes, 1042x1600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hajime-no-ippo_1.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../Ippo%20Kapak.jpg` (image/jpeg, 175468 bytes, 600x921) |  |  |  |
| details author | PASS | George Morikawa |  |  |  |
| details artist | PASS | George Morikawa |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Makunouchi Ippo Japonya'da sıradan bir lise öğrencisidir. Okuldan kalan zamanının çoğunu annesine aile işlerini yönetmesinde yardım ederek geçirdiğinden, çoğu genç gibi gençliğinin tadını çıkaramaz. Okulda ise sürekli zorbalığa uğrayan Ippo'nun hayatı oldukça zorludur. Bir gün okuldan sonra yine zorbalığa uğradığı sırada, Takamura isimli bir boksör tarafından kurtarılan Ippo'nun hayatı iyi yönde ilerler. Daha sonra Takamura'nın ayak izlerini takip ederek bir boksör olmaya karar verir ve hayatına bir anlam ve amaç katar. Ippo'nun boksörlük yeteneğini geliştirmek içinse önünde çok yol vardır. 15. Kodansha Manga Ödüllerinde, En İyi Manga ödülünü kazanmıştır. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 232 chapters |  |  |  |
| chapter dates | PASS | 232 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../00.jpg` (image/jpeg, 1253799 bytes, 1042x1600) |  |  |  |
