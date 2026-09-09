# Extension Validation Report

- Extension: tachiyomi-en.novelcrow-v1.4.53
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 4344163117450761946
- Source name: NovelCrow
- Source language: en
- Selected manga input: popular offset 0: Secret Desires [NandoF] (`.../secret-desires-nandof`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Secret Desires [NandoF] (`.../secret-desires-nandof`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 18 | My Boner Academia (My Hero Academia) [Suavi-Cream] (`.../my-boner-academia-my-hero-academia-suavi-cream`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 18 | Uraraka Comic! [DakiZed] (`.../uraraka-comic-dakized`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 18 | Sweat and Sacrifice [Thicknsinister] (`.../sweat-and-sacrifice-thicknsinister`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Secret Desires [NandoF] (`.../secret-desires-nandof`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Secret Desires [NandoF] (`.../secret-desires-nandof`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 5 | 1 . Secret Desires - Chapter 1 [NandoF] (`https://novelcrow.com/.../1-secret-desires-chapter-1-nandof`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 121 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Desires \[NandoF\], URL=`.../secret-desires-nandof` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://novelcrow.com/.../Secret-Desires-NandoF-2-350x476.webp` (image/webp (encoding: lossy), 10368 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../secret-desires-nandof` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://novelcrow.com/.../Secret-Desires-NandoF-2-193x278.webp` (image/webp (encoding: lossy), 4944 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | NandoF |  |  |  |
| details genres | PASS | 3D, Big Breasts, Big Nipples, Big Penis, Cum on Face, Deepthroat, Hairy, Handjob, Huge Breasts, Incest, Lingerie, Masturbation, MILF, Mother, Paizuri |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 3D porn comic by NandoF.<br><br>Support artist @<br><br>subscribestar.adult/nandof |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 5 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 121 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://novelcrow.com/.../001---Image.webp` (image/webp (encoding: lossy), 575048 bytes, 2304x2074) |  |  |  |
