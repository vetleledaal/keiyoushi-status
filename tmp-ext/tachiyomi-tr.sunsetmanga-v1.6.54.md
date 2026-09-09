# Extension Validation Report

- Extension: tachiyomi-tr.sunsetmanga-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 6406690174131145499
- Source name: Sunset Manga
- Source language: tr
- Selected manga input: popular offset 0: Selfish Romance (`.../3665`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Selfish Romance (`.../3665`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | I’ll Take That Marriage This Time (`.../3934`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | The Cup of Vengeance Is in Your Hands (`.../2067`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Zamanı Azalan Kötü Kalpli Dük’ü Kurtarmadım (`.../3562`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Selfish Romance (`.../3665`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Selfish Romance (`.../3665`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 54 | 1. Bölüm (`.../1-bolum`) |  | <1s |
| pages | `getPageList(chapter)` | success | 84 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Selfish Romance, URL=`3665` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://www.sunsetmanga.com/.../giris-yapiniz.jpg` -> 12 manga URLs (examples: `2785`, `4499`, `4635`) |  |  |  |
| thumbnail | PASS | `https://sunsetmanga.com/.../the-selfish-romance-v0-s060l3uyj19e1-e1737907443942-350x476.jpg` (image/jpeg, 36001 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `3665` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://sunsetmanga.com/.../the-selfish-romance-v0-s060l3uyj19e1-e1737907443942.jpg` (image/jpeg, 55420 bytes, 418x540) |  |  |  |
| details author | PASS | Gyogyo Park |  |  |  |
| details artist | PASS | Gyogyo Park |  |  |  |
| details genres | PASS | Dram, Manhwa, Romantik, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 30’lu yaşlarında sıradan bir kadın ve erkek olan Hyeondo ve Yumin, sevgililerine hala aşık olmalarına rağmen çeşitli sebepler yüzünden onlardan ayrılırlar. Bencilce eski aşklarını geri kazanmayı uman ikili bir plan yapar. Eski sevgililerini kışkırtmak umuduyla birbirleriyle çıkıyormuş gibi davranırlar. Bencilce ve aptalca planları gerçekten işe yarayacak mıdır?<br><br>Alternative Names: Selfish Love Theory/ Теория эгоистичной любви/ 이기적 연애론/ 利己恋爱论/ Bencil Aşk |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 54 chapters |  |  |  |
| chapter dates | PASS | 54 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 84 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://sunsetmanga.com/.../1.webp` (image/webp (encoding: lossy), 141876 bytes, 1920x1080) |  |  |  |
