# Extension Validation Report

- Extension: tachiyomi-ca.fansubscathentai-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7575385310756416449
- Source name: Hentai.cat
- Source language: ca
- Selected manga input: popular offset 0: La història d’una noia que va enviar accidentalment una autofoto eròtica (`.../la-historia-d-una-noia-que-va-enviar-accidentalment-una-autofoto-erotica`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 13 | La història d’una noia que va enviar accidentalment una autofoto eròtica (`.../la-historia-d-una-noia-que-va-enviar-accidentalment-una-autofoto-erotica`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 13 | La història d’una noia que va enviar accidentalment una autofoto eròtica (`.../la-historia-d-una-noia-que-va-enviar-accidentalment-una-autofoto-erotica`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | La història d’una noia que va enviar accidentalment una autofoto eròtica (`.../la-historia-d-una-noia-que-va-enviar-accidentalment-una-autofoto-erotica`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | La història d’una noia que va enviar accidentalment una autofoto eròtica (`.../la-historia-d-una-noia-que-va-enviar-accidentalment-una-autofoto-erotica`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | One-shot (`.../19533`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 9 |  |  | <1s |

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
| popular listing | PASS | 13 entries |  |  |  |
| latest listing | PASS | 13 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=La història d’una noia que va enviar accidentalment una autofoto eròtica, URL=`la-historia-d-una-noia-que-va-enviar-accidentalment-una-autofoto-erotica` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 27/27 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 27/27 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.hentai.cat/.../version_4513.jpg` (image/jpeg, 93409 bytes, 424x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `la-historia-d-una-noia-que-va-enviar-accidentalment-una-autofoto-erotica` |  |  |  |
| details thumbnail URL | PASS | `https://static.hentai.cat/.../version_4513.jpg` |  |  |  |
| details author | PASS | Wakamatsu |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Hentai, Laboral, Personatges adults |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | La Izawa practica les autofotos eròtiques i acaba enviant-ne una a un company de feina. L’endemà, tots dos acabaran fent feina fins tard i sols a l’oficina... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://fideusalacassola.xyz/.../01.png` (image/png, 1616605 bytes, 1280x1810) |  |  |  |
