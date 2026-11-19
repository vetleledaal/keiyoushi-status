# Extension Validation Report

- Extension: tachiyomi-tr.sunsetmanga-v1.6.57
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6406690174131145499
- Source name: Sunset Manga
- Source language: tr
- Selected manga input: popular offset 0: Mother’s Friends (`.../mothers-friends`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Mother’s Friends (`.../mothers-friends`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Bunk Bed (`.../bunk-bed`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Mother’s Friends (`.../mothers-friends`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Bunk Bed (`.../bunk-bed`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Mother’s Friends (`.../mothers-friends`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mother’s Friends (`.../mothers-friends`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 8 | 1. Bölüm (`.../1-bolum`) |  | <1s |
| pages | `getPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mother’s Friends, URL=`.../mothers-friends` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://b-cdn.sunsetscans.com.tr/.../2389-1794395496-Mothers-Friends-Manhwa-224x320-1.jpg` (image/jpeg, 18967 bytes, 224x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mothers-friends` |  |  |  |
| details thumbnail URL | PASS | `https://b-cdn.sunsetscans.com.tr/.../2389-1794395496-Mothers-Friends-Manhwa-224x320-1.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Smut, Yetişkin |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Mother’s Friends serisini Türkçe olarak okuyun. "Teyzen sana her şeyi tek tek öğretecek~♥︎” Sürekli ana kuzusu muamelesi gördükten sonra nihayet annesinden uzaklaşmayı başarır; fakat bu kez de annesinin arkadaşları ona kafayı... En yeni ve güncel bölümler Sunset Scans adresinde. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | PASS | 8 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | FAIL | 36 of 36 pages have invalid URLs: page 1: imageUrl=`==tZ0tQAlRGA5pGZ8kUZ5ZwZ8kUpvI2qhRQZj8PMzMTAwE2LlpGM2ZGAmVGMkHzA2tQM5pmL2V2A3NwLl8vA2R2AjV2ZjRwMySzAsS2MhSJoiVUqh02ow5lphS2LmEKMm5Jqm5voxAJYv9lY6ZUp0EUn` (relative URL), page 2: imageUrl=`==tZ0tQAlRGA5pGZ8kUZ5ZwZ8kUpvI2qhVQZj8PMzMTAwE2LlpGM2ZGAmVGMkHzA2tQM5pmL2V2A3NwLl8vA2R2AjV2ZjRwMySzAsS2MhSJoiVUqh02ow5lphS2LmEKMm5Jqm5voxAJYv9lY6ZUp0EUn` (relative URL), page 3: imageUrl=`==tZ0tQAlRGA5pGZ8kUZ5ZwZ8kUpvI2qhZQZj8PMzMTAwE2LlpGM2ZGAmVGMkHzA2tQM5pmL2V2A3NwLl8vA2R2AjV2ZjRwMySzAsS2MhSJoiVUqh02ow5lphS2LmEKMm5Jqm5voxAJYv9lY6ZUp0EUn` (relative URL), page 4: imageUrl=`==tZ0tQAlRGA5pGZ8kUZ5ZwZ8kUpvI2qhDQZj8PMzMTAwE2LlpGM2ZGAmVGMkHzA2tQM5pmL2V2A3NwLl8vA2R2AjV2ZjRwMySzAsS2MhSJoiVUqh02ow5lphS2LmEKMm5Jqm5voxAJYv9lY6ZUp0EUn` (relative URL), page 5: imageUrl=`==tZ0tQAlRGA5pGZ8kUZ5ZwZ8kUpvI2qhHQZj8PMzMTAwE2LlpGM2ZGAmVGMkHzA2tQM5pmL2V2A3NwLl8vA2R2AjV2ZjRwMySzAsS2MhSJoiVUqh02ow5lphS2LmEKMm5Jqm5voxAJYv9lY6ZUp0EUn` (relative URL), and 31 more | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `==tZ0tQAlRGA5pGZ8kUZ5ZwZ8kUpvI2qhRQZj8PMzMTAwE2LlpGM2ZGAmVGMkHzA2tQM5pmL2V2A3NwLl8vA2R2AjV2ZjRwMySzAsS2MhSJoiVUqh02ow5lphS2LmEKMm5Jqm5voxAJYv9lY6ZUp0EUn` (image/webp (encoding: lossy), 495882 bytes, 720x5000; server Content-Type: application/octet-stream) |  |  |  |
