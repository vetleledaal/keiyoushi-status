# Extension Validation Report

- Extension: tachiyomi-ar.despairmanga-v1.4.32
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
- Source ID: 886527590434722171
- Source name: Despair Manga
- Source language: ar
- Selected manga input: latest offset 0: Haimiya-senpai wa Kowakute Kawaii (`.../haimiya-senpai-wa-kowakute-kawaii`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | solo leveling (`.../solo-leveling`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | bastard (`.../bastard`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Haimiya-senpai wa Kowakute Kawaii (`.../haimiya-senpai-wa-kowakute-kawaii`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | The S-Class Hunter Doesn’t Want to Be a Villainous Princess (`.../the-s-class-hunter-doesnt-want-to-be-a-villainous-princess`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Haimiya-senpai wa Kowakute Kawaii (`.../haimiya-senpai-wa-kowakute-kawaii`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Haimiya-senpai wa Kowakute Kawaii (`.../haimiya-senpai-wa-kowakute-kawaii`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 36 | Chapter 1 (`.../haimiya-senpai-wa-kowakute-kawaii-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Haimiya-senpai wa Kowakute Kawaii, URL=`.../haimiya-senpai-wa-kowakute-kawaii` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i1.wp.com/.../1_20260524143523-1.png <redacted query values: resize>` (image/png, 26270 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../haimiya-senpai-wa-kowakute-kawaii` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i1.wp.com/.../1_20260524143523-1.png` (image/png, 376890 bytes, 720x1024) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | رومانسي, شريحة من الحياة, كوميديا, مدرسي, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | في ثانويتي، يهاب الطلبة هايميا-سينباي مرعوبين. ويعزى ذلك لهيئتها وكلامها الفظ… وماترتديه من أقراط! وشعرها الرمادي الطويل المقصوص. وتدب لهجتها الكانساوية الرهبة في النفوس. ولأمر لا ادرك كنهه ولا أستبينه، تسدي إلي من اللطف مالا تسديه لغيري. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 36 chapters |  |  |  |
| chapter dates | PASS | 36 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i0.wp.com/.../001.webp <redacted query values: ssl>` (image/webp (encoding: lossy), 308826 bytes, 1080x1536) |  |  |  |
