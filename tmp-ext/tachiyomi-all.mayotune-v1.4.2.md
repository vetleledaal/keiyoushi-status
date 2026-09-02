# Extension Validation Report

- Extension: tachiyomi-all.mayotune-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 1480743237782384863
- Source name: MayoTune
- Source language: en
- Selected manga input: latest offset 0: Tune In to the Midnight Heart (`<redacted URL #1: manga resource; relative; no scheme>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 1 | Tune In to the Midnight Heart (`<redacted URL #1: selected resource; relative; no scheme>`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 1 | Tune In to the Midnight Heart (`<redacted URL #1: selected resource; relative; no scheme>`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Tune In to the Midnight Heart (`<redacted URL #1: selected resource; relative; no scheme>`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Tune In to the Midnight Heart (`<redacted URL #1: selected resource; relative; no scheme>`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 129 | Chapter 1: RE:START (`.../chapters <redacted query values: id and number>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 54 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 1 entries |  |  |  |
| latest listing | PASS | 1 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tune In to the Midnight Heart, URL=`/` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 3/3 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 3/3 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mayochuu.xyz/.../cover.jpg` (image/jpeg, 182973 bytes, 1358x2031) |  |  |  |
| details identity | PASS | Details preserved selected URL `/` |  |  |  |
| details thumbnail URL | PASS | `https://mayochuu.xyz/.../cover.jpg` |  |  |  |
| details author | PASS | Masakuni Igarashi |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance , School Club , Harem , YAMABUKI , Yuri |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | When Arisu Yamabuki was all alone in bed at night, he was able to find solace in the voice of a radio host who went by "Apollo." However, one day, she simply stopped broadcasting without any explanation. Years then passed, and Arisu is now a second-year high-schooler. He makes it his mission to search for Apollo, as there is something he wants to tell her. He doesn't know what she looks like, or even what her real name is, but he manages to get some leads on her in his school's broadcasting club. That's where he meets four girls who all dream to get a job where they can make full use of their voices! Just who is Apollo, and how will those four's dreams pan out? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 129 chapters |  |  |  |
| chapter dates | PASS | 129 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mayochuu.xyz/.../1` (image/jpeg, 580226 bytes, 960x1378) |  |  |  |
