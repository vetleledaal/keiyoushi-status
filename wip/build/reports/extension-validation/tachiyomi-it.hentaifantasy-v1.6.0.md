# Extension Validation Report

- Extension: tachiyomi-it.hentaifantasy-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 398037379041422243
- Source name: HentaiFantasy
- Source language: it
- Selected manga input: popular offset 0: Monster Musume No Iru Nichijou (`.../monster_musume_no_iru_nichijou`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | Monster Musume No Iru Nichijou (`.../monster_musume_no_iru_nichijou`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 15 | Sore wa Rekishi ni Kakanaide! (`.../sore_wa_rekishi_ni_kakanaide`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 15 | Giovani e Frementi di Passione (`.../giovani-e-frementi-di-passione`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 15 | Splendide Morette (`.../splendide-morette`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Monster Musume No Iru Nichijou (`.../monster_musume_no_iru_nichijou`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Monster Musume No Iru Nichijou (`.../monster_musume_no_iru_nichijou`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 100 | Capitolo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 36 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Monster Musume No Iru Nichijou, URL=`.../monster_musume_no_iru_nichijou` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Monster Musume No Iru Nichijou, URL=`.../monster_musume_no_iru_nichijou` at page 1 offsets 0, 1, 2, 3, 5 and page 2 offsets 2, 3, 4, 5, 6, 9, 10, 11, 12, 13 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=La mia amica senza il senso del pudore, URL=`.../la-mia-amica-senza-il-senso-del-pudore` at page 1 offset 1 and page 2 offset 5, title=È per questo che faccio il massaggiatore!, URL=`.../e-per-questo-che-faccio-il-massaggiatore` at page 1 offsets 3, 7, 11 and page 2 offset 14, title=Mia Sorella, URL=`.../mia-sorella` at page 1 offset 4 and page 2 offset 12, title=Mako, URL=`.../mako` at page 1 offset 14 and page 2 offset 6 |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 12 manga entries; Popular page 2 repeats 9 manga entries; Latest page 1 repeats 3 manga entries; Latest page 2 repeats 4 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaifantasy.it/.../thumb_00s.jpg` (image/jpeg, 24124 bytes, 177x250) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../monster_musume_no_iru_nichijou` |  |  |  |
| details thumbnail URL | PASS | `https://hentaifantasy.it/.../thumb_00s.jpg` |  |  |  |
| details author | PASS | Okayado |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ecchi, Monster Girl |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Ebbene sì, le ragazze-mostro esistono e vogliono venire ad abitare da noi! Tre anni fa il mondo è venuto a sapere che lamie, arpie, centauri e qualsiasi altra creatura fantastica esistono veramente! Grazie al programma "Scambio Culturale Tra Specie", vedremo l'introduzione di queste creature mitologiche nella società umana. O almeno i loro tentativi. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 100 chapters |  |  |  |
| chapter dates | PASS | 100 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hentaifantasy.it/.../000a.jpg` (image/jpeg, 1973414 bytes, 3669x1600) |  |  |  |
