# Extension Validation Report

- Extension: tachiyomi-it.hentaifantasy-v1.4.7
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
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
- Selected manga input: latest offset 0: Il Condominio dei Cornuti (`.../il-condominio-dei-cornuti`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 15 | Monster Musume No Iru Nichijou (`.../monster_musume_no_iru_nichijou`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 15 | Sore wa Rekishi ni Kakanaide! (`.../sore_wa_rekishi_ni_kakanaide`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 15 | Il Condominio dei Cornuti (`.../il-condominio-dei-cornuti`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | Houjou no Reizoku Elf | Fertile Slave Elves (`.../houjou-no-reizoku-elf-fertile-slave-elves`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Il Condominio dei Cornuti (`.../il-condominio-dei-cornuti`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Il Condominio dei Cornuti (`.../il-condominio-dei-cornuti`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 3 | Capitolo 1: Married Woman Mansion (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Il Condominio dei Cornuti, URL=`.../il-condominio-dei-cornuti` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Monster Musume No Iru Nichijou, URL=`.../monster_musume_no_iru_nichijou` at page 1 offsets 0, 1, 2, 3, 5 and page 2 offsets 2, 3, 4, 5, 6, 9, 10, 11, 12, 13 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=È per questo che faccio il massaggiatore!, URL=`.../e-per-questo-che-faccio-il-massaggiatore` at page 1 offset 2 and page 2 offset 5, title=La mia amica senza il senso del pudore, URL=`.../la-mia-amica-senza-il-senso-del-pudore` at page 1 offset 11 and page 2 offset 8, title=Houjou no Reizoku Elf \| Fertile Slave Elves, URL=`.../houjou-no-reizoku-elf-fertile-slave-elves` at page 1 offset 14 and page 2 offsets 0, 1, 2 |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 12 manga entries; Popular page 2 repeats 9 manga entries; Latest page 1 repeats 3 manga entries; Latest page 2 repeats 3 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaifantasy.it/.../thumb_001.jpg` (image/jpeg, 21187 bytes, 179x250) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../il-condominio-dei-cornuti` |  |  |  |
| details thumbnail URL | PASS | `https://hentaifantasy.it/.../thumb_001.jpg` |  |  |  |
| details author | PASS | Shinozaki Rei |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ero-Manga, Cheating, Housewife, Milf, Netorare |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Una serie di storielle ci illustreranno come il condominio può essere un luogo in cui l'infedeltà coniugale è la regola e non l'eccezione. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hentaifantasy.it/.../001.jpg` (image/jpeg, 1462525 bytes, 1280x1789) |  |  |  |
