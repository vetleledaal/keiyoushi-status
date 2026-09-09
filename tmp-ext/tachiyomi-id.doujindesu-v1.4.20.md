# Extension Validation Report

- Extension: tachiyomi-id.doujindesu-v1.4.20
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7704282043609669342
- Source name: Doujindesu
- Source language: id
- Selected manga input: latest offset 0: Stop Smoking! (`.../stop-smoking`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | A Wonderful New World (`.../a-wonderful-new-world`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Silent War (My Kingdom) (`.../silent-war-my-kingdom`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Stop Smoking! (`.../stop-smoking`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Sugar Daddy (`.../sugar-daddy`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Stop Smoking! (`.../stop-smoking`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Stop Smoking! (`.../stop-smoking`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 110 | Chapter 1 (`.../0fa86be9-efea-43b5-b236-c66a89802dd1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 32 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Stop Smoking!, URL=`.../stop-smoking` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Circles, URL=`.../circles` at page 1 offset 11 and page 2 offset 5, title=The Cheat Hitter, URL=`.../the-cheat-hitter` at page 1 offset 18 and page 2 offset 1 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-static.desu.xxx/.../8845.jpg` (image/jpeg, 51155 bytes, 342x480) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../stop-smoking` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-static.desu.xxx/.../8845.jpg` |  |  |  |
| details author | PASS | AA,  IngSook |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Big Breast, Fingering, Full Color, Harem, Muscle, Nakadashi, Story Arc, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | **Sinopsis:**<br>Seorang pria yang sering mengalami penghinaan karena penampilannya yang seperti anak-anak kehilangan kesabarannya setelah asap rokok masuk ke rumahnya. Namun, tetangganya ternyata seorang wanita yang sangat menakutkan dan aneh.<br><br>**Seri:** Manhwa<br>**Judul Alternatif:** 담배피지 마세요!, Someone Stop Her!, Deja de fumar |  |  |  |
| metadata trimming | LINT | Untrimmed fields: author |  |  |  |
| chapters | PASS | 110 chapters |  |  |  |
| chapter dates | PASS | 110 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://amz-ch.desu.pics/.../1%20%281%29.webp <redacted query values: X-Amz-Algorithm, X-Amz-Date, X-Amz-Expires, X-Amz-Credential, and X-Amz-Signature>` (image/webp (container: extended), 663680 bytes, 735x7919) |  |  |  |
