# Extension Validation Report

- Extension: tachiyomi-id.kanzenin-v1.4.33
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
- Source ID: 8834320474567176246
- Source name: Kanzenin
- Source language: id
- Selected manga input: latest offset 0: MILF Hunting In Another World (`.../milf-hunting-in-another-world`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 27 | The Pleasure Shop (`.../the-pleasure-shop`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 27 | Mama Kari (`.../mama-kari`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 27 | MILF Hunting In Another World (`.../milf-hunting-in-another-world`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 27 | The Reincarnated Man (`.../the-reincarnated-man`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | MILF Hunting In Another World (`.../milf-hunting-in-another-world`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | MILF Hunting In Another World (`.../milf-hunting-in-another-world`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 136 | Chapter 1 (`.../milf-hunting-in-another-world-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 21 |  |  | 1-10s |

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
| popular listing | PASS | 27 entries |  |  |  |
| latest listing | PASS | 27 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=MILF Hunting In Another World, URL=`.../milf-hunting-in-another-world` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 109/109 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 109/109 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kanzenin.info/.../MILF-Hunting-In-Another-World-193x278-1.jpg` (image/jpeg, 12538 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../milf-hunting-in-another-world` |  |  |  |
| details thumbnail URL | PASS | `https://kanzenin.info/.../MILF-Hunting-In-Another-World-193x278-1.jpg` |  |  |  |
| details author | PASS | ERO404 |  |  |  |
| details artist | PASS | ERO404 |  |  |  |
| details genres | PASS | Harem, Mature, Romance, Story arc, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Setelah tertangkap saat melakukan hubungan intim dengan MILFS lainnya, Taeyang melarikan diri ke dunia lain. Berbagi tempat tidur dengan MILF kelas atas dengan tubuh yang luar biasa?! Selamat makan~! Akankah Taeyang bisa membuat haremnya sendiri di dunia ini dengan aman?<br><br>Alternative Names: 이세계 밀프 헌터 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 136 chapters |  |  |  |
| chapter dates | PASS | 136 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `http://cdnkomikindo.xyz/.../1.jpg` (image/jpeg, 123913 bytes, 720x1080) |  |  |  |
