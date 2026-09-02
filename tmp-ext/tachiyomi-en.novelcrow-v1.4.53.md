# Extension Validation Report

- Extension: tachiyomi-en.novelcrow-v1.4.53
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4344163117450761946
- Source name: NovelCrow
- Source language: en
- Selected manga input: popular offset 0: Aunt Hina [Bobtheneet] (`.../aunt-hina-bobtheneet`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Aunt Hina [Bobtheneet] (`.../aunt-hina-bobtheneet`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 18 | My Neighbor’s Widow [Rose Blue 3D] (`.../my-neighbors-widow-rose-blue-3d`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 18 | Admiring her GOCK [Agreeable_Swim_6551] (`.../admiring-her-gock-agreeable_swim_6551`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 18 | Aunt Hina [Bobtheneet] (`.../aunt-hina-bobtheneet`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Aunt Hina [Bobtheneet] (`.../aunt-hina-bobtheneet`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Aunt Hina [Bobtheneet] (`.../aunt-hina-bobtheneet`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 4 | 1 . Aunt Hina - Chapter 1 [Bobtheneet] (`https://novelcrow.com/.../1-aunt-hina-chapter-1-bobtheneet`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 58 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Aunt Hina \[Bobtheneet\], URL=`.../aunt-hina-bobtheneet` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://novelcrow.com/.../Aunt-Hina-Chapter-1-Bobtheneet-350x476.webp` (image/webp (encoding: lossy), 37828 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../aunt-hina-bobtheneet` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://novelcrow.com/.../Aunt-Hina-Chapter-1-Bobtheneet-193x278.webp` (image/webp (encoding: lossy), 15388 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | ElijahZX |  |  |  |
| details genres | PASS | Ahegao, Anal, Aunt, BBW / Chubby / Fat Woman, Big Areolae, Big Ass, Big Breasts, Big Penis, Bloomers, Blowjob, Dark Nipples, Exposed Clothing, Full Color, Hairy, Hairy Armpits, Huge Breasts, MILF, Nakadashi / Creampie, Schoolgirl Uniform, Sole Male, Sweating, Western, X-RAY |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | He wants aunt’s sexy body in his birthday wish and she accepts.<br><br>Artist links @<br><br>x.com/bobtheneet1?lang=en patreon.com/bobtheneet |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 4 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 58 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://novelcrow.com/.../001---Image.webp` (image/webp (encoding: lossy), 267160 bytes, 1680x2309) |  |  |  |
