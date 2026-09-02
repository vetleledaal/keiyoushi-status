# Extension Validation Report

- Extension: tachiyomi-it.hentaifantasy-v1.4.7
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 398037379041422243
- Source name: HentaiFantasy
- Source language: it
- Selected manga input: latest offset 0: È per questo che faccio il massaggiatore! (`.../e-per-questo-che-faccio-il-massaggiatore`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 15 | Monster Musume No Iru Nichijou (`.../monster_musume_no_iru_nichijou`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 15 | Sore wa Rekishi ni Kakanaide! (`.../sore_wa_rekishi_ni_kakanaide`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 15 | È per questo che faccio il massaggiatore! (`.../e-per-questo-che-faccio-il-massaggiatore`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | Houjou no Reizoku Elf | Fertile Slave Elves (`.../houjou-no-reizoku-elf-fertile-slave-elves`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | È per questo che faccio il massaggiatore! (`.../e-per-questo-che-faccio-il-massaggiatore`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | È per questo che faccio il massaggiatore! (`.../e-per-questo-che-faccio-il-massaggiatore`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 4 | Capitolo 1 (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 29 |  |  | 1-10s |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=È per questo che faccio il massaggiatore!, URL=`.../e-per-questo-che-faccio-il-massaggiatore` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Monster Musume No Iru Nichijou, URL=`.../monster_musume_no_iru_nichijou` at page 1 offsets 0, 1, 2, 3, 5 and page 2 offsets 2, 3, 4, 5, 6, 9, 10, 11, 12, 13 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=È per questo che faccio il massaggiatore!, URL=`.../e-per-questo-che-faccio-il-massaggiatore` at page 1 offset 0 and page 2 offsets 3, 13, title=La mia amica senza il senso del pudore, URL=`.../la-mia-amica-senza-il-senso-del-pudore` at page 1 offset 9 and page 2 offset 6, title=Houjou no Reizoku Elf \| Fertile Slave Elves, URL=`.../houjou-no-reizoku-elf-fertile-slave-elves` at page 1 offsets 12, 13, 14 and page 2 offset 0 |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 12 manga entries; Popular page 2 repeats 9 manga entries; Latest page 1 repeats 5 manga entries; Latest page 2 repeats 3 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaifantasy.it/.../thumb_001_cover.jpg` (image/jpeg, 24416 bytes, 177x250) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../e-per-questo-che-faccio-il-massaggiatore` |  |  |  |
| details thumbnail URL | PASS | `https://hentaifantasy.it/.../thumb_001_cover.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ero-Manga, Cheating, Housewife, Milf, Oppai |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Per il giovane massaggiatore Seiichi è arrivato finalmente il momento che aspettava da tutta una vita: poter massaggiare delle bellissime milf di una squadra di pallavolo femminile! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://hentaifantasy.it/.../001_cover.jpg` (image/jpeg, 1015555 bytes, 1128x1600) |  |  |  |
