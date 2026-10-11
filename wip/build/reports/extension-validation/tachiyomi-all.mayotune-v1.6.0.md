# Extension Validation Report

- Extension: tachiyomi-all.mayotune-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 1480743237782384863
- Source name: MayoTune
- Source language: en
- Selected manga input: popular offset 0: Tune In to the Midnight Heart (`<redacted URL #1: manga resource; relative; no scheme>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 1 | Tune In to the Midnight Heart (`<redacted URL #1: selected resource; relative; no scheme>`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 1 | Tune In to the Midnight Heart (`<redacted URL #1: selected resource; relative; no scheme>`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tune In to the Midnight Heart (`<redacted URL #1: selected resource; relative; no scheme>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tune In to the Midnight Heart (`<redacted URL #1: selected resource; relative; no scheme>`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 132 | Chapter 1: RE:START (`.../chapters <redacted query values: id and number>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 54 |  |  | 1-10s |

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
| chapters | PASS | 132 chapters |  |  |  |
| chapter dates | PASS | 132 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | details: `https://mayochuu.xyz/.../chapters` to `https://mayochuu.xyz/.../chapters` (1 redirects); details: `https://mayochuu.xyz/.../chapters <redacted query values: id and number>` to `https://mayochuu.xyz/.../chapters <redacted query values: id and number>` (1 redirects) |  |  |  |
| page load | PASS | `https://mayochuu.xyz/.../1` (image/jpeg, 580226 bytes, 960x1378) |  |  |  |
