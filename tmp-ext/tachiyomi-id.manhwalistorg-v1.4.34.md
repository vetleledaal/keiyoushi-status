# Extension Validation Report

- Extension: tachiyomi-id.manhwalistorg-v1.4.34
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 1031213229391436059
- Source name: IsekaiKomik
- Source language: id
- Selected manga input: latest offset 0: Cosmic Heavenly Demon 3077 (`.../cosmic-heavenly-demon-3077`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | The Crow’s Prince (`.../the-crows-prince`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Adeline’s Deep Night (`.../adelines-deep-night`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Cosmic Heavenly Demon 3077 (`.../cosmic-heavenly-demon-3077`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Academy’s Undercover Professor (`.../academys-undercover-professor`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Cosmic Heavenly Demon 3077 (`.../cosmic-heavenly-demon-3077`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Cosmic Heavenly Demon 3077 (`.../cosmic-heavenly-demon-3077`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 103 | Chapter 1 (`.../cosmic-heavenly-demon-3077-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 102 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Cosmic Heavenly Demon 3077, URL=`.../cosmic-heavenly-demon-3077` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ch1.isekaikomik.site/.../Cosmic-Heavenly-Demon-3077-231x300.jpg` (image/jpeg, 23167 bytes, 231x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../cosmic-heavenly-demon-3077` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ch1.isekaikomik.site/.../Cosmic-Heavenly-Demon-3077.jpg` (image/jpeg, 86882 bytes, 480x623) |  |  |  |
| details author | PASS | Sanha |  |  |  |
| details artist | PASS | Kim Dae-young |  |  |  |
| details genres | PASS | Action, Comedy, Demons, Drama, Fantasy, Magic, Martial arts, Military, Post-apocalyptic, Sci-fi, Space, Supernatural, Wuxia, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Setelah bertahun-tahun yang tak terhitung jumlahnya, Iblis Surgawi yang tersegel di dalam Gunung Tai akhirnya terbangun, hanya untuk mengetahui bahwa umat manusia telah lama meninggalkan Bumi yang penuh radiasi dan kini menjelajahi pelosok galaksi.<br><br>Alternative Names: Space Heavenly Demon 3077 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 103 chapters |  |  |  |
| chapter dates | PASS | 103 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 102 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.isekaikomik.com/.../001.jpg` (image/jpeg, 170274 bytes, 800x3000) |  |  |  |
