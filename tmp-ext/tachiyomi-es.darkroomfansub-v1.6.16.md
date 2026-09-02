# Extension Validation Report

- Extension: tachiyomi-es.darkroomfansub-v1.6.16
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

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2769673412724723872
- Source name: Dark Room Fansub
- Source language: es
- Selected manga input: popular offset 0: Smoky Nectar Renew (`.../smoky-nectar-renew.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Smoky Nectar Renew (`.../smoky-nectar-renew.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Hotaru wa Ashita Shinu (`.../hotaru-wa-ashita-shinu.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Smoky Nectar Renew (`.../smoky-nectar-renew.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Smoky Nectar Renew (`.../smoky-nectar-renew.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../ch-6.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Smoky Nectar Renew, URL=`.../smoky-nectar-renew.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../cover.jpeg` (image/jpeg, 137353 bytes, 600x853) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../smoky-nectar-renew.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../cover.jpeg` (image/jpeg, 59153 bytes, 340x484) |  |  |  |
| details author | PASS | Akira |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Vampire |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | El escritor Mitsuru Hasegawa y Anna Yusei, quien trabaja en bienes raíces, comparten un vínculo especial. Estos dos amigos de la infancia, que también son pareja, guardan un secreto: Anna es un "Vampiro" que necesita alimentarse de sangre humana, mientras que Mitsuru posee una sangre especial conocida como "Néctar", que es altamente deseada por los Vampiros. Ambos han firmado un "contrato de simbiosis", una relación en la que ninguno de los dos puede sobrevivir sin la sangre del otro. Para Anna, quien ha amado a Mitsuru desde que eran pequeños, vivir estos días junto a él es como un sueño hecho realidad. Sin embargo, al mismo tiempo, Anna carga con un sentimiento de culpa hacia Mitsuru que no puede ignorar... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../AVvXsEhNi4BsgJ0fGP4cyD1WmhIn5YDG3XulJ3KdbvQGR7VRHHic3GFQJ2d9Hxtzz4FpTmQT-wg_VsAoKw11Y-FcvJ9ocESRn9N8QrEdt9bWtSeQdRGVHKOtgtye_2h1UcS937rzLeW3oCoLClGQzvbGnio2NR-WZ-T1OxWRCijSjf_oNq_3DiPcqUXvHVo2HQ` (image/png, 579110 bytes, 792x612) |  |  |  |
