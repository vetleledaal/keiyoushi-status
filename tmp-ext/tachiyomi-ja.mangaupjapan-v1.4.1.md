# Extension Validation Report

- Extension: tachiyomi-ja.mangaupjapan-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 697820552173578283
- Source name: Manga UP! (Japan)
- Source language: ja
- Selected manga input: popular offset 0: 神達に拾われた男 (`.../237`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | 神達に拾われた男 (`.../237`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 64 | 皇帝陛下のお世話係〜女官暮らしが幸せすぎて後宮から出られません～ (`.../891`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 神達に拾われた男 (`.../237`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 神達に拾われた男 (`.../237`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 285 | 第1話 - 異世界転生 (`.../41740`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 52 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 64 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=神達に拾われた男, URL=`.../237` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 115/115 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 115/115 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ja-img.manga-up.com/.../237.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 38880 bytes, 640x442) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../237` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ja-img.manga-up.com/.../237.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 124902 bytes, 1242x828) |  |  |  |
| details author | PASS | 原作：Roy, 漫画：蘭々, キャラクター原案：りりんら, 構成（66話以降）：中村基 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 少年, アニメ化・実写化, ファンタジー・幻想, 日常・ほのぼの, 異世界, ファンタジー・幻想 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 日本の中年サラリーマン竹林竜馬は、死後、三柱の神に協力を求められ、子どもの姿で異世界へ転生！ 森で一人、のんびり暮らし始めた竜馬は、魔法でテイムしたスライムたちの研究にのめり込んで行き…。 「小説家になろう」発! 意外と有能なスライムたちとまったり第二の人生を謳歌する、異世界スローライフファンタジー！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 285 chapters |  |  |  |
| chapter dates | LINT | All 285 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=285 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://ja-img.manga-up.com/.../156380960_1_001.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 53414 bytes, 1080x1536) |  |  |  |
