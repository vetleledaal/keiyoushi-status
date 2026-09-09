# Extension Validation Report

- Extension: tachiyomi-en.rinkocomics-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4915548839286527736
- Source name: Rinko Comics
- Source language: en
- Selected manga input: popular offset 0: The Demon I Raised Was Abandoned, and He Won’t Let the Saintess Escape (`.../he-demon-i-raised-was-abandoned-and-he-wont-let-the-saintess-escape`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 8 | The Demon I Raised Was Abandoned, and He Won’t Let the Saintess Escape (`.../he-demon-i-raised-was-abandoned-and-he-wont-let-the-saintess-escape`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | When I Married The Impotent Duke I Wanted To Protect The Child (`.../when-i-married-the-impotent-duke-i-wanted-to-protect-the-child`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | The Maid With a Child (`.../the-maid-with-a-child`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Demon I Raised Was Abandoned, and He Won’t Let the Saintess Escape (`.../he-demon-i-raised-was-abandoned-and-he-wont-let-the-saintess-escape`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Demon I Raised Was Abandoned, and He Won’t Let the Saintess Escape (`.../he-demon-i-raised-was-abandoned-and-he-wont-let-the-saintess-escape`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 13 | Chapter 1 (`.../the-demon-i-raised-was-abandoned-and-he-wont-let-the-saintess-escape-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 19 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Demon I Raised Was Abandoned, and He Won’t Let the Saintess Escape, URL=`.../he-demon-i-raised-was-abandoned-and-he-wont-let-the-saintess-escape` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rinkocomics.com/.../ba6defed-5b19-406c-a115-aa77532edfaf-225x300.webp` (image/webp (encoding: lossy), 20834 bytes, 225x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../he-demon-i-raised-was-abandoned-and-he-wont-let-the-saintess-escape` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://rinkocomics.com/.../ba6defed-5b19-406c-a115-aa77532edfaf-768x1024.webp` (image/webp (encoding: lossy), 130874 bytes, 768x1024) |  |  |  |
| details author | PASS | Unknown Author |  |  |  |
| details artist | PASS | Manhwa |  |  |  |
| details genres | PASS | Drama, Fantasy, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “I’ll never let you escape again.” Rana, a former Saintess, has been stripped of her powers and now lives quietly in a mansion on the outskirts of the royal palace, waiting for death as she is scornfully called the “White Witch.” Even though she is no longer the Saintess, she is still forced to bear the “pain” of others in place of Isabella, the current Saintess. She has become nothing more than a tool for the people around her. Even so, Rana continues to endure it all, telling herself, “If someone can be saved because of me…” One day, while serving in the slums, Rana encounters Silvie, an orphaned boy who suffers a near-fatal injury while protecting her. Blaming herself for being unable to heal his wounds, Rana desperately nurses him back to health. The innocent boy quickly grows attached to her, asking, “Can I stay here?” And so, an unusual life together begins at the mansion. Sharing meals with someone, laughing together, and having someone she genuinely wants to protect slowly allows Rana to thaw the heart that had long since frozen over. But around that same time, Rana begins having strange dreams every night. In them, an unfamiliar yet beautiful man gently pulls her into his arms and whispers sweetly, “Remember me.” A former Saintess who was only ever allowed to die, now loved by the most obsessively devoted demon in the world. A dark romance of all-consuming obsession and overwhelming devotion. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 13 chapters |  |  |  |
| chapter dates | PASS | 13 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.rinkocomics.com/.../01__156d8418-bce0-4304-939d-4335f2edfc7a.webp` (image/webp (encoding: lossy), 1142642 bytes, 800x8165) |  |  |  |
