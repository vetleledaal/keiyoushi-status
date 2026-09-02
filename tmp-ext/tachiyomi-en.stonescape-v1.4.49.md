# Extension Validation Report

- Extension: tachiyomi-en.stonescape-v1.4.49
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5914422711950728870
- Source name: StoneScape
- Source language: en
- Selected manga input: latest offset 0: Got Dropped Into a Ghost Story, Still Gotta Work (`.../ghost-story-work`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Plaything (`.../plaything`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Got Dropped Into a Ghost Story, Still Gotta Work (`.../ghost-story-work`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | Ghost Story Club (`.../ghost-story-club`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Got Dropped Into a Ghost Story, Still Gotta Work (`.../ghost-story-work`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Got Dropped Into a Ghost Story, Still Gotta Work (`.../ghost-story-work`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 17 | Chapter 0 - Prologue (`.../ch-0`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 14 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Got Dropped Into a Ghost Story, Still Gotta Work, URL=`.../ghost-story-work` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 57/57 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 57/57 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://stonescape.xyz/.../b8719e60-bb1f-4a00-8678-24893d5dca08.webp` (image/webp (encoding: lossless), 390020 bytes, 500x700) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ghost-story-work` |  |  |  |
| details thumbnail URL | PASS | `https://stonescape.xyz/.../b8719e60-bb1f-4a00-8678-24893d5dca08.webp` |  |  |  |
| details author | PASS | Carrotoon |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Horror, Drama, Adaptation, Gore, Mature, Mystery, Fantasy, Thriller |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | NOW HIRING
<br>— URGENT —
<br>
<br>Ghost Story Specialist Corporation
<br>Daydream Inc. (Ltd.)
<br>
<br>Insane Benefits – Come to Work Immediately
<br>※ Note : The company is not liable for any injuries or fatalities that may occur during the course of the employee’s duties.
<br>——
<br>A pop-up event for some ‘modern fantasy’ media I loved so much that I even took a precious day off work to attend.
<br>
<br>On that day, I ended up transmigrating as a character in that very fantasy world.
<br>As none other than a newly hired employee at a famous large corporation!
<br>
<br>A dream job with great benefits, an excellent salary, and even kind and competent bosses.
<br>I’m using the information I know about the world to rise through the ranks at lightning speed!
<br>
<br>Am I happy, you ask?
<br>Please, just let me go home. I’m begging you |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 17 chapters |  |  |  |
| chapter dates | PASS | 17 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://stonescape.xyz/.../72096a97-b89b-4ad4-9d23-e394a1f74a0f.webp` (image/webp (encoding: lossless), 4568666 bytes, 690x6670) |  |  |  |
