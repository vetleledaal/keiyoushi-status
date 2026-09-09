# Extension Validation Report

- Extension: tachiyomi-id.mangasusu-v1.4.37
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 8157748444640827548
- Source name: Mangasusu
- Source language: id
- Selected manga input: latest offset 0: MILF Hunting In Another World (`.../milf-hunting-in-another-world`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Secret Class (`.../secret-class`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Water Overflow (`.../water-overflow`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | MILF Hunting In Another World (`.../milf-hunting-in-another-world`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Love Quest (`.../love-quest`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | MILF Hunting In Another World (`.../milf-hunting-in-another-world`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | MILF Hunting In Another World (`.../milf-hunting-in-another-world`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 135 | Chapter 1 (`.../milf-hunting-in-another-world-chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 21 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=MILF Hunting In Another World, URL=`.../milf-hunting-in-another-world` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangasusuku.com/.../MILF-Hunting-In-Another-World-193x278-1.jpg` (image/jpeg, 12538 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../milf-hunting-in-another-world` |  |  |  |
| details thumbnail URL | PASS | `https://mangasusuku.com/.../MILF-Hunting-In-Another-World-193x278-1.jpg` |  |  |  |
| details author | PASS | ERO404 |  |  |  |
| details artist | PASS | ERO404 |  |  |  |
| details genres | PASS | Adult, Comedy, Drama, Ecchi, Manhwa, Mature, Romance, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Setelah tertangkap saat berhubungan intim dengan MILF lainnya, Taeyang melarikan diri ke dunia lain. Berbagi tempat tidur dengan MILF kelas atas dengan tubuh yang luar biasa?! Selamat makan~! Akankah Taeyang bisa membuat haremnya sendiri di dunia ini dengan aman?<br><br>Alternative Names: Mother Hunting In Another World, Different World Milf Hunter |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 135 chapters |  |  |  |
| chapter dates | PASS | 135 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `http://wibulep.xyz/.../1.jpg` (image/jpeg, 123913 bytes, 720x1080) |  |  |  |
