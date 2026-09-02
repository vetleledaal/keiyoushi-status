# Extension Validation Report

- Extension: tachiyomi-en.scansgg-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5988638662832109557
- Source name: ScansGG
- Source language: en
- Selected manga input: popular offset 0: My First Love, Transformed! (`.../17936`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 21 | My First Love, Transformed! (`.../17936`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 21 | Danger: Do Not Mix! The Chaotic Rhapsody of the Gyaru Summoner and the Stoic Swordsman (`.../17876`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 14 | Ghost Dating Simulation (`.../8548`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 14 | Bangnanggisaro Saraganeun Beop (`.../2330`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | My First Love, Transformed! (`.../17936`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | My First Love, Transformed! (`.../17936`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 1 (`.../chapter-navigation <redacted query values: series_id, chapter_id, and group_id>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 35 |  |  | 1-10s |

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
| popular listing | PASS | 21 entries |  |  |  |
| latest listing | PASS | 14 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My First Love, Transformed!, URL=`17936` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 71/71 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 71/71 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.scans.gg/.../565f2b-1f0bb5-0a6602-5a4ce5.avif` (image/avif (format: avif), 30768 bytes, 445x592) |  |  |  |
| details identity | PASS | Details preserved selected URL `17936` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.scans.gg/.../565f2b-1f0bb5-0a6602-5a4ce5.avif` |  |  |  |
| details author | PASS | Hyeok-sang |  |  |  |
| details artist | PASS | Hyeok-sang |  |  |  |
| details genres | PASS | Drama, Comedy, Shoujo, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “You still haven’t gotten over your first love? …That was back in elementary school.”<br><br>Seo Woo-jin, an engineering nerd who had a major glow-up from his awkward childhood days, has been harboring an unrequited love for the same girl for ten years. Then one day, as if by some twist of fate, his first love suddenly appears right before his eyes…!<br><br>After ten years of unwavering devotion, the girl he could never forget has finally returned to his life. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.scans.gg/.../6890f9-3625b8-6b2fea-cdeeb3.avif` (image/avif (format: avif), 125930 bytes, 800x6755) |  |  |  |
