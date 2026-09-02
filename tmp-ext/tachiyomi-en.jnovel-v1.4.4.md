# Extension Validation Report

- Extension: tachiyomi-en.jnovel-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2482510125735992610
- Source name: J-Novel
- Source language: en
- Selected manga input: popular offset 0: Crybaby Love Song (`.../crybaby-love-song`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Crybaby Love Song (`.../crybaby-love-song`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 10 | My Death-Defying Dog: Man’s Best Friend, World’s Best Savior (`.../my-death-defying-dog-man-s-best-friend-world-s-best-savior`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Crybaby Love Song (`.../crybaby-love-song`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Crybaby Love Song (`.../crybaby-love-song`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 6 | Chapter 1 (`.../crybaby-love-song-chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 33 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Crybaby Love Song, URL=`crybaby-love-song` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 21/21 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 21/21 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.j-novel.club/.../4KX9Q7Z47NN55GD1TRVET.png` (image/webp (container: extended), 136736 bytes, 844x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `crybaby-love-song` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.j-novel.club/.../4M1ADZ8AZ1WGBBXTZNM6K.png` (image/webp (container: extended), 136736 bytes, 844x1200) |  |  |  |
| details author | PASS | Romeda Ando |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | high school, drama, romance, music, coming of age, BL, j-novel knight, step-siblings, performing |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | For high school saxophonist Kodai, music was always his escape. Or it was, until a devastating anxiety attack onstage cost his band a competition.<br><br>Now forced to confront his mother’s remarriage with no way out, he finds himself with a new family and a new stepbrother, the gloomy and withdrawn Fuyuki. Yet beneath that intimidating exterior lies a gentle, guitar-loving soul.<br><br>As Fuyuki helps Kodai overcome his fear of performing, gratitude deepens into something far deeper—and far more complicated. But when it comes time for Kodai to help Fuyuki face the trauma that silenced his own music, will their bond strike a powerful new chord or will it collapse beneath the pressure? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://flame.j-novel.club/.../3SYENQDG0QFFKZE4__XEBP-h2048-00 <redacted query values: clientid and token>` (image/webp (encoding: lossy), 564066 bytes, 1441x2048; server Content-Type: application/vnd.e4p.qsc) |  |  |  |
