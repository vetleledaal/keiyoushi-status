# Extension Validation Report

- Extension: tachiyomi-ja.rawuwu-v1.4.1
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
- Source ID: 2270841189174019045
- Source name: Raw UwU
- Source language: ja
- Selected manga input: latest offset 0: Isekai Teni Shita Ore wa, H no Tabi ni Gacha wo Hiku! - Motte Kure, Ore no Seiryoku! (`.../857649`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 40 | Number 1 striker (`.../579`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 40 | Dare demo Dakeru Kimi ga Suki  (`.../779293`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 40 | Isekai Teni Shita Ore wa, H no Tabi ni Gacha wo Hiku! - Motte Kure, Ore no Seiryoku! (`.../857649`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 40 | Mobile Suit Gundam Twilight Axis (`.../869840`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Isekai Teni Shita Ore wa, H no Tabi ni Gacha wo Hiku! - Motte Kure, Ore no Seiryoku! (`.../857649`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Isekai Teni Shita Ore wa, H no Tabi ni Gacha wo Hiku! - Motte Kure, Ore no Seiryoku! (`.../857649`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 27 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 30 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Isekai Teni Shita Ore wa, H no Tabi ni Gacha wo Hiku! - Motte Kure, Ore no Seiryoku!, URL=`857649` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rawuwu.net/.../857649-300x427.webp` (image/webp (encoding: lossy), 38356 bytes, 300x427) |  |  |  |
| details identity | PASS | Details preserved selected URL `857649` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://rawuwu.net/.../857649-768x1092.jpeg` (image/jpeg, 199974 bytes, 768x1092; server Content-Type: application/octet-stream) |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | comedy, fantasy, adult |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ノクターンノベルズで1000万PV超えの人気作がついに漫画化！仕事終わりの夜、試しに始めたゲームがきっかけで〝異世界転移〟を果たしてしまったケン。突然女神に魔王出現の阻止を命じられたうえ、与えられたチートスキルは「Hをするたびにガチャが引ける」というもの。この謎の力を駆使して、無事に世界を救えるのか⁉煩悩だらけの異世界奇譚、開幕‼<br><br>Alternative Names: <br> - 異世界転移した俺は、Hのたびにガチャを引く！～もってくれ、俺の精力！～<br> - Isekai Teni Shita Ore Wa<br> - H No Tabi Ni Gacha Wo Hiku! ~motte Kure<br> - Ore No Seiryoku!~ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 27 chapters |  |  |  |
| chapter dates | PASS | 27 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s4.rawuwu.net/.../000-1125x1600.webp` (image/webp (encoding: lossy), 116244 bytes, 1125x1600) |  |  |  |
