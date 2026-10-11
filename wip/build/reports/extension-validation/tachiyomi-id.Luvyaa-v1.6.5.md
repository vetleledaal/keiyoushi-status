# Extension Validation Report

- Extension: tachiyomi-id.Luvyaa-v1.6.5
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 1316015886884953118
- Source name: Luvyaa
- Source language: id
- Selected manga input: popular offset 0: Flowers Are Bait (`.../flowers-are-bait`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Flowers Are Bait (`.../flowers-are-bait`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 18 | Love Quest (`.../love-quest`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 18 | Chuan Jin Sai Bo Youxi Hou Gandiao BOSS Chenggong Shangwei (`.../chuan-jin-sai-bo-youxi-hou-gandiao-boss-chenggong-shangwei`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Marked as the Tyrant’s Daughter-in-Law (`.../marked-as-the-tyrants-daughter-in-law`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Flowers Are Bait (Novel) (`.../flowers-are-bait-novel`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Flowers Are Bait (`.../flowers-are-bait`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 57 | Chapter 1 (`.../flowers-are-bait-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 223 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Flowers Are Bait, URL=`.../flowers-are-bait` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 74/74 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 74/74 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://v5.luvyaa.co/.../xxlarge.webp` (image/webp (encoding: lossy), 134412 bytes, 960x1358) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../flowers-are-bait` |  |  |  |
| details thumbnail URL | PASS | `https://v5.luvyaa.co/.../xxlarge.webp` |  |  |  |
| details author | PASS | Author |  |  |  |
| details artist | PASS | Artist |  |  |  |
| details genres | PASS | Genre, Adaptation, Adult, Comedy, Drama, Josei, Mature, Mystery, Romance, Smut |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Iyeon menginginkan kehidupan yang tenang sebagai ahli pohon—namun di lantai atas, tersembunyi seorang pembunuh yang sedang koma, yang pernah mencoba membunuhnya. Ketika pria itu terbangun tanpa ingatan apa pun, Iyeon panik… dan berbohong: “Aku istrimu.” Bisakah dia selamat dari pria yang tidak mengingatnya—atau apa yang pernah dilakukannya?<br><br>Alternative Names: <br>- Flower of Allure<br>- Flores São Iscas<br>- Flowers Are Bait<br>- Kkoch-eun Mikkiya<br>- Đóa Hoa Là Mồi Nhử<br>- Цветы — лишь приманка<br>- กลลวงกลีบดอกไม้<br>- 花は甘い<br>- 花即誘餌<br>- 꽃은 미끼야 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 57 chapters |  |  |  |
| chapter dates | PASS | 57 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 223 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img1.cdn-nyaa.link/.../01.webp <redacted query values: v>` (image/webp (container: extended), 42878 bytes, 728x410) |  |  |  |
