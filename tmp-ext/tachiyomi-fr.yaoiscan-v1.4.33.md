# Extension Validation Report

- Extension: tachiyomi-fr.yaoiscan-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7333825394865171341
- Source name: YaoiScan
- Source language: fr
- Selected manga input: popular offset 0: Jinx [Non censurée] (`.../jinx-non-censure`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Jinx [Non censurée] (`.../jinx-non-censure`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Pire que des inconnus (`.../stranger-than-friends`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | À chanter sur l’eau (`.../a-chanter-sur-leau`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Un chaton ou je deviens fou ! (`.../un-chaton-ou-je-deviens-fou`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Jinx [Non censurée] (`.../jinx-non-censure`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Jinx [Non censurée] (`.../jinx-non-censure`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 108 | Chapitre 1 (`.../jinx-non-censuree-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 197 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Jinx \[Non censurée\], URL=`.../jinx-non-censure` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://yaoiscan.fr/.../01-90-225x300.jpg` (image/jpeg, 20679 bytes, 225x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../jinx-non-censure` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://yaoiscan.fr/.../01-90.jpg` (image/jpeg, 205458 bytes, 840x1120) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Boys love, Drame, Manhwa, Mature, Non-censuré, Smut, Sports, Webtoon, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Un champion des arts martiaux mixtes, dur à cuire et caractériel mais beau comme un dieu, est victime d’un maléfice : il doit toujours tirer son coup la veille au soir d’un combat pour gagner. Un nouveau kiné arrive, un freluquet gentil, naïf et surtout… sans-le-sou. Parfait, il n’aura plus qu’à le payer pour le satisfaire et à lui la victoire !<br><br>Alternative Names: Jinx (Mingwa),JINX：ジンクス, Vận xui, Джинкс, 징크스 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 108 chapters |  |  |  |
| chapter dates | LINT | All 108 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=108 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 197 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://s22.yaoiscan.fr/.../1.webp` (image/webp (encoding: lossy), 120942 bytes, 1280x2000) |  |  |  |
