# Extension Validation Report

- Extension: tachiyomi-en.xyzcomics-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 2
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 923206914242009120
- Source name: XYZ Comics
- Source language: en
- Selected manga input: popular offset 0: MotherFuckerZ in Dragon Ball [BrompolosAnma_Art] (`.../motherfuckerz-in-dragon-ball-brompolosanma_art`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | MotherFuckerZ in Dragon Ball [BrompolosAnma_Art] (`.../motherfuckerz-in-dragon-ball-brompolosanma_art`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | [Jabcomix] That ASS ! -Dat ASS ! – AI Gen (`.../jabcomix-that-ass-dat-ass-ai-gen`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | MotherFuckerZ in Dragon Ball [BrompolosAnma_Art] (`.../motherfuckerz-in-dragon-ball-brompolosanma_art`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | MotherFuckerZ in Dragon Ball [BrompolosAnma_Art] (`.../motherfuckerz-in-dragon-ball-brompolosanma_art`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../motherfuckerz-in-dragon-ball-brompolosanma_art`) |  | <1s |
| pages | `getPageList(chapter)` | success | 29 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=MotherFuckerZ in Dragon Ball \[BrompolosAnma_Art\], URL=`.../motherfuckerz-in-dragon-ball-brompolosanma_art` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://xyzcomics.com/.../013-2-392x600-q72.webp` (image/webp (encoding: lossy), 331430 bytes, 1280x2080) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../motherfuckerz-in-dragon-ball-brompolosanma_art` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://xyzcomics.com/.../001-2.webp` was not downloaded |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | big ass, Big Breasts, blowjob, brompolos, bulma briefs, dragon ball z, Milf, Mom-Son, mother, muscle |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://xyzcomics.com/.../001-2.webp` (image/webp (encoding: lossy), 331430 bytes, 1280x2080) |  |  |  |
