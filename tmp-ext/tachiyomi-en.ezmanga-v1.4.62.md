# Extension Validation Report

- Extension: tachiyomi-en.ezmanga-v1.4.62
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
- Source ID: 3317136566565343717
- Source name: EZmanga
- Source language: en
- Selected manga input: latest offset 0: Slow Melting (`.../slow-melting`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | For Your Murder (`.../for-your-murder`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | My Possession Became a Ghost Story (`.../my-possession-became-a-ghost-story`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Slow Melting (`.../slow-melting`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | I Refuse to Be Tamed! (`.../i-refuse-to-be-tamed!`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 10 | Slow Melting (`.../slow-melting`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Slow Melting (`.../slow-melting`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 80 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 25 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Slow Melting, URL=`slow-melting` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 90/90 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 90/90 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.ezmanga.org/.../ohmpjh5nph1g6myujjs4dgak.jpeg` (image/jpeg, 37970 bytes, 350x466) |  |  |  |
| details identity | PASS | Details preserved selected URL `slow-melting` |  |  |  |
| details thumbnail URL | PASS | `https://media.ezmanga.org/.../ohmpjh5nph1g6myujjs4dgak.jpeg` |  |  |  |
| details author | PASS | Early Flower, Team Savanna |  |  |  |
| details artist | PASS | Soy Media |  |  |  |
| details genres | PASS | Romance, Drama |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Yeomin Chae has been living in the shadow of her stepsister, Nari Chae, ever since they were kids. One day, Seungjae, Yeomin's ex-boyfriend, tells her that he’s marrying Nari out of the blue. After being betrayed by the person she trusted most, she runs into Hwan Yun, who is the grandson of Taeju Group’s chairman. Frustrated with her life, she suggests to Hwan that he marry her. As the two decide to get married, what exciting events and struggles will they encounter?<br><br>Alternative Titles: 멜팅 슬로우, Melting Slowly |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 80 chapters |  |  |  |
| chapter dates | PASS | 80 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://media.ezmanga.org/.../0.webp` (image/webp (encoding: lossy), 1060962 bytes, 690x5730) |  |  |  |
